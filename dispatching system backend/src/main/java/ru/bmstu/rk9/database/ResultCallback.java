package ru.bmstu.rk9.database;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultCallback {
    void call(ResultSet result) throws SQLException;
}