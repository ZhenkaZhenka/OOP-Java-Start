using System;

namespace View
{
    public class Menu
    {
        public int SelectFunction()
        {
            Console.WriteLine(
                    "--------------------------------------\n" +
                    "Выберите действие:\n" +
                    "--------------------------------------\n" +
                    "1. сложение\n" +
                    "2. вычитание\n" +
                    "3. умножение\n" +
                    "4. деление\n" +
                    "--------------------------------------\n");
            return Convert.ToInt32(Console.ReadLine());
        }

        public int SelectCalc()
        {
            Console.WriteLine(
                    "--------------------------------------\n" +
                    "Выберите тип чисел:\n" +
                    "--------------------------------------\n" +
                    "1. рациональные\n" +
                    "2. комплексные\n" +
                    "--------------------------------------\n"
                            );
            return Convert.ToInt32(Console.ReadLine());
        }
    }
}