package task4;

//Создайте класс Box, в котором будут определены 4 конструктора.
//Каждый конструктор должен выводить объём этой коробки
//(не важны единицы измерения, формулу объёма можно вспомнить или найти в интернете) из расчёта её высоты, длины и ширины.
//
//Создайте такие конструкторы:
//- Принимающий все 3 параметры
//- Принимающий 2 параметра, а третий будет определён каким-то стандартным значением
//- Принимающий 1 параметр, а второй и третий будут определены какими-то стандартными значениями
//- Конструктор без аргументов - все значения будут определены внутри конструктора
//Не забудьте про вывод объёма в каждом конструкторе

public class Task4 {
    public static void main(String[] args) {
        Box boxWithAllArgumentsConstructor = new Box(3, 2, 4);
        Box boxWithTwoArgumentsConstructor = new Box(2,4);
        Box boxWithOneArgumentConstructor = new Box(4);
        Box boxWithNoArgumentsConstructor = new Box();

        System.out.println("--------------NO-----------------");
        BoxNew boxNewWithNoArgumentsConstructor = new BoxNew();
        System.out.println("--------------All------------------");
        BoxNew boxNewWithAllArgumentsConstructor = new BoxNew(3,2,4);
        System.out.println("--------------TWO----------------");
        BoxNew boxNewWithTwoArgumentsConstructor = new BoxNew(2,4);
        System.out.println("--------------ONE----------------");
        BoxNew boxNewWithOneArgumentConstructor = new BoxNew(4);
    }
}
