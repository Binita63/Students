/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Binita.daopattern;

import com.Binita.entry.entity.Student;

/**
 *
 * @author Bini
 */
public interface StudentDAO {
    boolean insert(Student s);
    boolean update(int id,Student s);
    boolean delete(int id);
    Student getById(int id);
    Student [] getAll();
    
    
}
