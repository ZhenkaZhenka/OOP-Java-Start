using System;

namespace View
{

    public class ViewRational
    {

        public double GetValue(String title)
        {
            Console.WriteLine(title);
            return Convert.ToDouble(Console.ReadLine());
        }

        public void Print(double data, String title)
        {
            Console.WriteLine(title + " " + data);
        }

    }
}