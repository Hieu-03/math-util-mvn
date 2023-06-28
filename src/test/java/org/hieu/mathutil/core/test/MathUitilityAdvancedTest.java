/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.hieu.mathutil.core.test;

import org.hieu.mathutil.core.MathUtility;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Hieu-Acer
 */
public class MathUitilityAdvancedTest {
    //CHUẨN BỊ SẴN RIÊNG TEST DATA, LÁT HỒI FILL VÀO HÀM
    //DDT
    //Hàm trả về mảng 2 chiều, iểu WRAPPER CLASS/OBJECT
    //mảng chứa cặp n -> expected, ví dụ 0! -> 1; 1! -> 1; 5! -> 120
    public static Object[][] intiTestData(){
        Object[][] testData = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {5, 120},
                               {6, 7200}
                              };
        return testData;
    }
    @ParameterizedTest
    @MethodSource(value = "intiTestData")
    public void testFactorialGivenRightArgumentReturnWell(int n, long expected){
        //tham số hóa việc đưa test data vào hàm assertEquals()
        //biến đổi dữ liệu thành đành tham số cho tổng quát
        //PARAMETERIZED
        assertEquals(expected, MathUtility.getFactorial(n));
        //ctrl + F6 to run
    }  
}

// TDD là kĩ thuật viết code chính đang xen với viết test case/test script
//Script , tức là quá trình viết code làm app ta viết luôn nhứng đoạn code (dùng thư viện Unit Test như JUnit, TestNG, xUnit, MSTest,...) dùng để test hàm ta vừa viết

//Viết code và viết code test cùng với nhau thì gọi là kĩ thuật lập trình hướng về kiểm thử - TDD

//DDT 
//Là kĩ thuật bổ trợ/mở rộng thêm cho kĩ thuật TDD
//là kĩ thuật viết test code mà ta tách riêng những bộ data test ra  chỗ, câu lệnh so sánh ra 1 chỗ
//Kết nối, map/fill test data vào hàm test thông qua các tham số
//{6, 720} -> fill vào 2 biến n, expected và lát hồi 2 biến này 
// 

