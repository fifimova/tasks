package org.example.skypro;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* продемонстрировать явную проверку условий ожидания. */
public class Task30 {

    public static void main(String[] args) {
        // Используем ReentrantLock для создания блокировки и условия
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        // Создаем и запускаем поток ожидания
        Thread waiterThread = new Thread(new Waiter(lock, condition));
        waiterThread.start();

        // Создаем и запускаем поток уведомления
        Thread notifierThread = new Thread(new Notifier(lock, condition));
        notifierThread.start();
    }

    // Поток ожидания
    static class Waiter implements Runnable {
        private final Lock lock;
        private final Condition condition;

        public Waiter(Lock lock, Condition condition) {
            this.lock = lock;
            this.condition = condition;
        }

        @Override
        public void run() {
            System.out.println("Waiter thread started");

            // Захватываем блокировку
            lock.lock();

            try {
                // Ожидаем условие
                System.out.println("Waiter is waiting for the condition");
                condition.await();

                // После пробуждения продолжаем выполнение
                System.out.println("Waiter thread resumed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // Освобождаем блокировку
                lock.unlock();
            }
        }
    }

    // Поток уведомления
    static class Notifier implements Runnable {
        private final Lock lock;
        private final Condition condition;

        public Notifier(Lock lock, Condition condition) {
            this.lock = lock;
            this.condition = condition;
        }

        @Override
        public void run() {
            System.out.println("Notifier thread started");

            // Задержка 3 секунды
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Захватываем блокировку
            lock.lock();

            try {
                // Уведомляем ожидающий поток
                condition.signal();

                // Выводим сообщение после уведомления
                System.out.println("Notifier sent signal");
            } finally {
                // Освобождаем блокировку
                lock.unlock();
            }
        }
    }
}
