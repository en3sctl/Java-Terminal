package com.company;

public class Student {

    public static int uniqueNum = 0;

    private static int getUniqueNum() {
        uniqueNum++;
        return uniqueNum;
    }

    private String name;
    private int id;

    public Student(String name) {
        this.name = name;
        this.id = getUniqueNum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return ("Name: " + name + " ID: " + id);
    }

    //==================================================================
    public class StudNode {

        private Student student;
        private StudNode next;

        public StudNode(Student student) {
            this.student = student;

        }

        public StudNode getNext() {
            return next;
        }

        public void setNext(StudNode next) {
            this.next = next;
        }

        public Student getStudent() {
            return student;
        }
    }

    //==================================================================
    public class StudGroup {

        private String groupName;
        private StudNode head;

        public StudGroup(String groupName) {
            this.groupName = groupName;
            this.head = null;
        }

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public void addFront(Student s) {
            StudNode temp = new StudNode(s);
            temp.setNext(this.head);
            this.head = temp;
        }

        public void addFront(String name) {
            this.addFront(new Student(name));
        }

        public void addBack(Student s) {
            StudNode temp = this.head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
                temp.setNext(new StudNode(s));
            }
        }

        public void addBack(String name) {
            addBack(new Student(name));
        }

        public int count() {
            int count = 0;
            StudNode temp = this.head;

            while (temp != null) ;
            count++;
            temp = temp.getNext();

            return count;
        }
    }

    public boolean isWithId(int id) {
        StudNode temp = this.head;
        while (temp != null) {
            if (getStudent().getId() == id)
                return true;
            temp = temp.getNext();
        }
        return false;
    }

    public Student[] getStudsWithName(String name) {
        int count = 0;
        StudNode temp = this.head;
        while (temp != null){
            if(temp.getStudent().getName().equals(name))
                count++;
            temp = temp.getNext();
        }
        Student [] arr = new Student[count];
        count = 0;
        temp = this.head;
        while (temp != null){
            if(temp.getStudent().getName().equals(name))
                arr[count++] = temp.getStudent());
            temp = temp.getNext();

        }
        return arr;
    }

    public Student getStudent(int id) {
        if (id == 0) {
            return null;
        }
    }
}