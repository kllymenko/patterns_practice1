package ua.klymenko.DAO.Factory;


import ua.klymenko.DAO.EntityDAO.HomeworkDAO;
import ua.klymenko.DAO.EntityDAO.LessonDAO;
import ua.klymenko.DAO.EntityDAO.UserDAO;

public interface DAOFactory {
    UserDAO getUserDAO();

    LessonDAO getLessonDAO();


    HomeworkDAO getHomeworkDAO();
}
