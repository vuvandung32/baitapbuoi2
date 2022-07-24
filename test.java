import java.time.Duration;
import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.sound.midi.Patch;
import javax.sound.midi.SoundbankResource;

public class test {
   
        public static void main(String[] args) {
            //bài 1
            
            String letter = "Thân gửi các bạn,Dưới đây là câu nói nổi tiếng \n\t\" A journey of a thousand miles begins with a single step\"\nNó có nghĩa là \n\t\"Hành trình ngàn dặm bắt đầu từ một bước chân\"\nChúc các bạn thành công !!!";
            System.out.println(letter);

            //bài 2
           
                double distant = 0.0;
                String startTimeStr = "";
                String finishTimeStr = "";
                Scanner scanner = new Scanner(System.in);
                System.out.println("nhập khoản cách :");
                distant = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("nhập tời gian bắt đầu:");
                startTimeStr  = scanner.next();
                System.out.println("nhập thời gian kết thúc :");
                finishTimeStr = scanner.next();

                scanner.close();

                LocalDateTime starTime=LocalDateTime.parse(startTimeStr);
            
                LocalDateTime finishTime= LocalDateTime.parse(finishTimeStr);



                

               

                System.out.println("thời gian chạy :");
                Duration duratio= Duration.between(starTime, finishTime);
                System.out.printf("Thời gian chạy %s phút\n", duratio.toMinutes());
                System.out.printf("Vận tốc trung bình %s km/h\n", duratio.toMinutes()/60);
            }







                          }        
    

    

