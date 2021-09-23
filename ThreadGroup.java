public class ThreadGroup implements Runnable {
    public ThreadGroup(String string) {
    }

    public ThreadGroup() {
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroup runnable = new ThreadGroup();
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

        Thread t1 = new Thread(tg1, "one");
        t1.start();
        Thread t2 = new Thread(tg1, "two");
        t2.start();
        Thread t3 = new Thread(tg1, "three");
        t3.start();

        System.out.println("Thread Group Name: " + tg1.getName());
        tg1.list();
    }

    private String getName() {
        return null;
    }

    private void list() {
    }
}


