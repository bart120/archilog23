// See https://aka.ms/new-console-template for more information
using MySql.Data.MySqlClient;
using System.Data.Common;
using System.Data.SqlClient;

Console.WriteLine("Hello, World!");
string mail = "toto@gmail.com";
using (DbConnection connexion = new MySqlConnection("server=localhost;uid=toto;pwd=bob;database=testdb"))
{
    connexion.Open();
    String req = "SELECT * from User WHERE login=@login;";

    using (DbCommand cmd = connexion.CreateCommand())
    {
        cmd.CommandText = req;
        cmd.Parameters.Add(new MySqlParameter("login", mail));
        using(DbDataReader reader = cmd.ExecuteReader())
        {
            while(reader.Read())
            {
                string firstname = reader["firstname"] as string;
                Console.WriteLine(firstname);
            }
        }
    }
}
