package com.company;

public class Task {

    private String description;
    private Task next;

    public Task(String d, Task n) {
        this.description = d;
        this.next = n;
    }

    public Task(String d) {
        this(d, null);
    }

    public void setNextTask(Task task) {
        this.next = task;
    }

    public void printTasks() {
        Task tmp = this;
        while (tmp != null) {
            System.out.print(tmp.description);
            tmp = tmp.next;
        }
    }

    public static void printTasks(Task head) {

    }

    /* private int countHowManyElements() {
        int count = 0;
        Task tmp = this;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }

       private void listElement(int indexNum) {
        int count = 0;
        Task tmp = this;
        while (tmp != null) {
            if (count == indexNum) {
                System.out.print(tmp.description);
                return;
            }
            count++;
            tmp = tmp.next;
        }
    }
    
    */
    public void printTasksRev() {
        printTasksRev(this);
    }

    public static void printTasksRev(Task head) {
        if (head != null) {
            if (head.next != null)
                printTasksRev(head.next);
            System.out.print(head.description);
        }
    }
}

