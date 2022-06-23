package Util;

import java.time.Duration;
import java.time.Instant;
/**
 * @author: Krishnanshu Agarwal
 * @version: 0.01
 * Date: 23 June 2022
 * Description: SImple class to calculate the time elapsed between a block of code.
 * This can be typically used to check the time consumend by any two blocks of code and compare them
 */

public class StopWatch {
    Instant start;
    Instant end;
    public void start(){
        start = Instant.now();
    }
    public void stop(){
        end = Instant.now();
    }
    public int getElapsedTime(){
        Duration dr = Duration.between(start, end);
        // System.out.println(dr.getNano());
        // System.out.println(dr.toString());
        return dr.getNano();
    }
    public void reset(){
        start = null;
        end = null;
    }
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        
        sw.start();
        int i=0;
        while(i<1000){
            i++;
        }
        sw.stop();
        System.out.println(sw.getElapsedTime());
        sw.reset();

        sw.start();
        i=0;
        while(i<100000){
            i++;
            int j=0;
            while(j<100000){
                j++;
            }
        }
        sw.stop();
        System.out.println(sw.getElapsedTime());
        sw.reset();
    }
}
