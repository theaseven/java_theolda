package Demo8;

// 2.创建一个类，实现Runnable接口，重写run方法，设置线程任务。
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("新线程" + Thread.currentThread().getName());
    }
}
