package com.learning.mahesh.part6oopsconcepts.abstractionclass.interfaces.employeeclass;

public abstract class TeamLeaders implements EmployeeBenifits{
    @Override
    public void freeDentalcare() {
        System.out.println("applies to you");;
    }

    @Override
    public void CycleToWork() {
        System.out.println("applies to you");;
    }

    @Override
    public void eyecare() {
        System.out.println("applies to you");;
    }

    @Override
    public abstract void extraholidays();

    @Override
    public abstract void bonus();


}
