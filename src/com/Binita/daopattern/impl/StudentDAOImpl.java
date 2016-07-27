/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Binita.daopattern.impl;

import com.Binita.daopattern.StudentDAO;
import com.Binita.entry.entity.Student;

/**
 *
 * @author Bini
 */
public class StudentDAOImpl implements StudentDAO {
    private int counter=0;
    private  Student[] Studentlist=new Student[5];

    @Override
    public boolean insert(Student s) {
        if (counter==Studentlist.length){
        return false;
        }
       Studentlist[counter]=s;
       counter++;
       return true;
    }

    @Override
    public boolean update(int id, Student s) {
        
        return true;
    }

    @Override
    public boolean delete(int id) {
        for(int i=0;i<Studentlist.length;i++){
            Student s=Studentlist[i];
            if (s!=null && s.getId()== id){
                
               Studentlist[i]=null; 
               return true;
                
            }
    }
        return false;

    }
    
    @Override
    public Student getById(int id) {
        for(int i=0;i<Studentlist.length;i++){
            Student s=Studentlist[i];
            if (s!=null && s.getId()== id){
                
               
               return s;
                
            }
    }
        return null;
    }

    @Override
    public Student[] getAll() {
        
    return Studentlist;
    }

    
    
}
