package db;

import models.Manager;
import models.Manufacturer;
import models.Rider;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBHelper {

    private static Transaction transaction;
    private static Session session;

    public static void saveOrUpdate(Object object) {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(object);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void save(Object object) {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void update(Object object) {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.update(object);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void delete(Object object){
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(object);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static <T> List<T> getList(Criteria criteria){
        session = HibernateUtil.getSessionFactory().openSession();
        List<T> results = null;
        try {
            transaction = session.beginTransaction();
            results = criteria.list();
            transaction.commit();
        } catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static <T> T getUnique(Criteria criteria){
        session = HibernateUtil.getSessionFactory().openSession();
        T result = null;
        try {
            transaction = session.beginTransaction();
            result = (T)criteria.uniqueResult();
            transaction.commit();
        } catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    public static <T> T find(Class classType, int id){
        session = HibernateUtil.getSessionFactory().openSession();
        T result = null;
        Criteria criteria = session.createCriteria(classType);
        criteria.add(Restrictions.idEq(id));
        result = getUnique(criteria);
        return result;
    }

    public static <T> List<T> getAll(Class classType){
        session = HibernateUtil.getSessionFactory().openSession();
        List<T> results = null;
        Criteria criteria = session.createCriteria(classType);
        results = getList(criteria);
        return results;
    }

    public static <T> List<T> getRiderChampionship() {
        session = HibernateUtil.getSessionFactory().openSession();
        List<T> standings = null;
        Criteria cr = session.createCriteria(Rider.class);
        cr.addOrder(Order.desc("championshipPoints"));
        standings = getList(cr);
        return standings;
    }

    public static List<Team> getTeamChampionship() {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Team> standings = null;
        Criteria cr = session.createCriteria(Team.class);
        cr.addOrder(Order.desc("championShipPoints"));
        standings = getList(cr);
        return standings;
    }

    public static List<Rider> findRidersByManager(Manager manager){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Rider> results = null;
        Criteria cr = session.createCriteria(Rider.class);
        cr.add(Restrictions.eq("manager", manager));
        results = getList(cr);
        return results;
    }

    public static List<Manager> findManufacturerByTeam(Team team){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Manager> results = null;
        Criteria cr = session.createCriteria(Manufacturer.class);
        cr.add(Restrictions.eq("team", team));
        results = getList(cr);
        return results;
    }



//    public static List<File> findFilesInFolder(Folder folder) {
//        session = HibernateUtil.getSessionFactory().openSession();
//        List<File> results = null;
//        Criteria cr = session.createCriteria(File.class);
//        cr.add(Restrictions.eq("folder", folder));
//        results = getList(cr);
//        return results;
//    }

//        session = HibernateUtil.getSessionFactory().openSession();
//        List<T> results = null;
//        Criteria cr = session.createCriteria(classType);
//        cr.addOrder(Order.asc("age"));
//        results = getList(cr);
//        return results;
//
//
//
//        session = HibernateUtil.getSessionFactory().openSession();
//        Double average = null;
//        Criteria cr = session.createCriteria(Employee.class);
//        cr.setProjection(Projections.avg("salary"));
//        average = (Double) getUniqueResult(cr);
//        return average;




}
