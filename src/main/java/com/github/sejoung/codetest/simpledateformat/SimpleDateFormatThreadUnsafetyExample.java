package com.github.sejoung.codetest.simpledateformat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpleDateFormatThreadUnsafetyExample {
    private static final Logger log = LoggerFactory.getLogger(SimpleDateFormatThreadUnsafetyExample.class);

    private static AtomicInteger counter = new AtomicInteger(0);

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        String dateStr = "2018-06-22";
        LocalDate date = LocalDate.now();
        int nThreads = 2;
        ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
        CyclicBarrier barrier = new CyclicBarrier(nThreads);

        for(int i = 0; i < nThreads; i++) {
            executorService.submit(()->{
                int idx = counter.addAndGet(1);
                barrier.await();

                log.info("Thread {}",idx);
                //formatDate(date);
                parseDate(dateStr);
                return null;
            });
        }

        executorService.shutdown();
    }

    private static void parseDate(String dateStr) {
        try {
            Date date = simpleDateFormat.parse(dateStr);
            System.out.println("Successfully Parsed Date " + date);
        } catch (ParseException e) {
            System.out.println("ParseError " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void formatDate(Date date) {
        try {
            String dateStr = simpleDateFormat.format(date);
            System.out.println("Successfully format Date " + dateStr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}