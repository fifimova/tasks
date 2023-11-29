package org.example.skypro;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* Напишите Java-программу для чтения данных из таблицы Excel. */
public class Task36 {

    public static void main(String[] args) {
//        try {
        takeExcel();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    static void takeExcel() /*throws IOException*/ {
//        FileInputStream fis = new FileInputStream("D:/Книга1.xlsx");
        try
                (FileInputStream fis = new FileInputStream(new File("D:/Книга1.xlsx"));) {
            // Создание экземпляра класса FileInputStream для чтения файла Excel
//            fis = new FileInputStream(new File("D:/Книга1.xlsx"));

            // Создание экземпляра класса Workbook для представления Excel-файла
            Workbook workbook = WorkbookFactory.create(fis);

            // Получение первого листа в файле
            Sheet sheet = (Sheet) workbook.getSheetAt(0);

            // Перебор всех строк в листе
//            for (Row row : sheet) {
//                // Перебор всех ячеек в строке
//                for (Cell cell : row) {
//                    // Получение значения ячейки как строки
//                    Double cellValue = cell.getNumericCellValue();
//                    System.out.print(cellValue + "\t");
//                }
//                System.out.println();
//            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
//        finally {
//            // Закрытие потока FileInputStream
//            fis.close();
//        }
    }
}
