using System;
using System.Text;

namespace View
{
    public class ViewComplex
    {
        public String GetValue(String title)
        {
            Console.WriteLine(title);
            while (true)
            {
                string? temp = Console.ReadLine();
                if (temp != null)
                {
                    return temp;
                }
            }
        }
        public void Print(StringBuilder? data, String? title)
        {
            Console.WriteLine(title + " " + data);
        }

    }
}