
package utils;

import java.util.Scanner;

/*
Inputter: là 1 class, 1 cái khuôn nhưng anh ko thích để đúc ra object
mà dùng Inputter để lưu hàm tiện ích 
hỗ trợ cho việc nhập 

nhưng ko có trong ko có Hàm

*/
public class Inputter {
    //props
    public static Scanner sc = new Scanner(System.in);
    
    //những method hỗ trợ việc nhập
    //1. method ép người dùng nhập số nguyên chuẩn
    public static int getAnInteger(String inpMsg, String errMsg) {
        System.out.println(inpMsg); //hiển thị lời mời
        while(true) {
            try{
                int number = Integer.parseInt(sc.nextLine());
                return number;
            }catch(Exception e) {
                System.out.println(errMsg);
            }
        }
    }
       
    //2. method ép người dùng nhập số nguyên chuẩn nhưng trong khoảng 
    public static int getAnInteger(String inpMsg, String errMsg, 
                                    int lowerBound, int upperBound) {
        
        if(lowerBound > upperBound) { // dành cho người vô tri
            int tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        System.out.println(inpMsg); //hiển thị lời mời
        while(true) {
            try{
                int number = Integer.parseInt(sc.nextLine());
                if(number < lowerBound || number > upperBound) {
                    throw new Exception();
                }
                return number;
            }catch(Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    
    //3. method ép người dùng nhập số thực
    public static double getADouble(String inpMsg, String errMsg) {
        System.out.println(inpMsg); //hiển thị lời mời
        while(true) {
            try{
                double number = Double.parseDouble(sc.nextLine());
                return number;
            }catch(Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    
    //4. method ép người dùng nhập số thực chuẩn trong khoảng 
    public static double getADouble(String inpMsg, String errMsg, 
                                    double lowerBound, double upperBound) {
        
        if(lowerBound > upperBound) { // dành cho người vô tri
            double tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        System.out.println(inpMsg); //hiển thị lời mời
        while(true) {
            try{
                double number = Double.parseDouble(sc.nextLine());
                if(number < lowerBound || number > upperBound) {
                    throw new Exception();
                }
                return number;
            }catch(Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    //5.Hàm nhập chuỗi cấm để trống
    public static String getString(String inpMsg, String errMsg) {
        System.out.println(inpMsg);
        while(true) {
            try {
                String str = sc.nextLine();
                if(str.isEmpty()) {
                    throw new Exception();
                }
                return str;
            }catch(Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    
    //6.Hàm nhập chuỗi cấm để trống và giống regex
    public static String getString(String inpMsg, String errMsg, String regex) {
        System.out.println(inpMsg);
        while(true) {
            try {
                String str = sc.nextLine();
                if(str.isEmpty() || !str.matches(regex)) {
                    throw new Exception();
                }
                return str;
            }catch(Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    
}

//hàm nhập ngày tháng năm theo chuẩn format
//f("nhập ngày tháng năm", "ngu", "DD-MM-YYYY", "YYYY-MM-DD")
//compareDate