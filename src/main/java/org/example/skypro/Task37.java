package org.example.skypro;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task37 {

    static List<Car> cars = new ArrayList<>();

    public static void main(String[] args) {
        readAll("D:/Car.xlsx", "D:/Upgrade.xlsx");
        System.out.println(cars);
//        Collections.reverse(cars);
//        Collections.swap(cars, 0, 1);
//        System.out.println(cars);

        Upgrade upgrade = new Upgrade(9, null, null);
        System.out.println(upgrade.getName());
        System.out.println(upgrade.getBool());
        // ошибка, т.к. для налла нельзя вызвать никакой метод
//        System.out.println(upgrade.getName().equals(upgrade.getBool()));
        // а такое метод может сравнивать два налла и дает тру даже не смотря на то, что это разные типы должны быть
        System.out.println(Objects.equals(upgrade.getName(), upgrade.getBool()));
    }

    static void readAll(String carPath, String upgradePath) {
        try (FileInputStream carInput = new FileInputStream(new File(carPath));
             Workbook workbook = WorkbookFactory.create(carInput);
             FileInputStream upgradeInput = new FileInputStream(new File(upgradePath));
             Workbook workbook2 = WorkbookFactory.create(upgradeInput)) {

            Sheet carSheet = workbook.getSheetAt(0);
            Sheet upgradeSheet = workbook2.getSheetAt(0);

            for (Row row : carSheet) {
                Car newCar = new Car((int) row.getCell(0).getNumericCellValue());

                String[] upgradesArray = row.getCell(1).getStringCellValue().split(",");
                List<Integer> upgradesList = new ArrayList<>();
                for (String id : upgradesArray) {
                    upgradesList.add(Integer.valueOf(id));
                }

                for (Row row2 : upgradeSheet) {
                    int upgradeId = (int) row2.getCell(0).getNumericCellValue();
                    String upgradeName = row2.getCell(1).getStringCellValue();

                    if (upgradesList.contains(upgradeId)) {
                        Upgrade upgrade = new Upgrade(upgradeId, upgradeName);
                        newCar.getUpgrades().add(upgrade);
                    }
                }
                cars.add(newCar);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Car {
    Integer id;
    List<Upgrade> upgrades;

    public Car(Integer id) {
        this.id = id;
        this.upgrades = new ArrayList<>();
    }

    public List<Upgrade> getUpgrades() {
        return upgrades;
    }

    @Override
    public String toString() {
        return "Car{" +
               "id=" + id +
               ", upgrades=" + upgrades +
               '}';
    }
}

class Upgrade {
    Integer id;
    String name;
    Boolean bool;

    public String getName() {
        return name;
    }

    public Boolean getBool() {
        return bool;
    }

    public Upgrade(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Upgrade(Integer id, String name, Boolean bool) {
        this.id = id;
        this.name = name;
        this.bool = bool;
    }

    @Override
    public String toString() {
        return "{" + id + ", " + name + '}';
    }
}
