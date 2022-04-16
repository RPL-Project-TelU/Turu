using System;
namespace Program
{
    class Tubes
    {
        static void Main()
        {
            Console.WriteLine("Berapa Banyak data Siswa ? (Enter as integer): ");
            int students = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("\t\t\t\tYou will be asked to enter data of student respectively !");


            string[] Names = new string[students];
            Console.WriteLine("\nMasukan nama Siswa: ");
            Names[0] = Console.ReadLine();

            for (int i = 1; i < students; i++)
            {
                Console.WriteLine("masukan nama siswa lainnya: ");
                Names[i] = Console.ReadLine();

            }

            int[] Marks = new int[students];
            try
            {
                for (int i = 0; i < students; i++)
                {
                    Console.WriteLine("masukan no peserta: {0}", Names[i]);
                    Marks[i] = Convert.ToInt32(Console.ReadLine());
                }
            }
            catch (Exception e)
            {
                Console.Clear();
                Console.WriteLine(e.Message);
                Console.WriteLine("Please Enter marks as a Integer data type! ");
                Console.WriteLine("Masukan Data lagi !");
                Main();
            }
            // Double 
            double[] Roll_No = new double[students];
            try
            {
                for (int i = 0; i < students; i++)
                {
                    Console.WriteLine("Enter the Roll No. of: {0}", Names[i]);
                    Roll_No[i] = Convert.ToDouble(Console.ReadLine());
                }
            }
            catch (Exception e)
            {
                Console.Clear();
                Console.WriteLine(e.Message);
                Console.WriteLine("Please Enter Roll No. as a Double data type! ");
                Console.WriteLine("Enter the data again !");
                Main();
            }
            float[] Percentange = new float[students];
            try
            {
                for (int i = 0; i < students; i++)
                {
                    Console.WriteLine("masukan presentasi kehadiran: {0}", Names[i]);
                    Percentange[i] = float.Parse(Console.ReadLine());

                }
            }

            catch (Exception e)
            {
                Console.Clear();
                Console.WriteLine(e.Message);
                Console.WriteLine("Please Enter Percentages No. as a Float data type! ");
                Console.WriteLine("Enter the data again !");
                Main();
            }

            // Diplaying the data of students ! 
            Console.BackgroundColor = ConsoleColor.Blue;
            Console.Clear();
            Console.ForegroundColor = ConsoleColor.White;
            Console.WriteLine("__________________________________________________");
            Console.WriteLine("|_____Nama____________|____Roll No___|___No Peserta____|_____presentase kehadiran_____|");
            for (int i = 0; i < students; i++)
            {

                Console.WriteLine(" {0}\t\t\t\t\t\t\t{1}\t\t\t\t{2}\t\t\t\t{3}      ", Names[i], Roll_No[i], Marks[i], Percentange[i]);

            }
        }
    }
}