import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	String fName;
	String lName;

	public Student(String first, String last)
	{
		fName = first;
		lName = last;
	}

	public String getfName()
	{
		return fName;
	}

	public void setfName(String fName)
	{
		this.fName = fName;
	}

	public String getlName()
	{
		return lName;
	}

	public void setlName(String lName)
	{
		this.lName = lName;
	}

	public String toString()
	{
		return fName + " " + lName + "\n";
	}

	public boolean equals(Object obj)
	{
		return (this.getfName().equals(((Student) obj).getfName())
				&& this.getlName().equals(((Student) obj).getlName()));
	}

}

public class SerializationTest
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Student s1 = new Student("Rajiv", "Saini");
		System.out.print("Before Serialization \t: ");
		System.out.println(s1);
		FileOutputStream fout = new FileOutputStream("serializedObj.dat");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);

		Student s3 = new Student("Rocket", "Singh");
		System.out.print("Before Serialization \t: ");
		System.out.println(s3);
		FileOutputStream fout1 = new FileOutputStream("serializedObj1.dat");
		out = new ObjectOutputStream(fout1);
		out.writeObject(s3);

		FileInputStream fin = new FileInputStream("serializedObj.dat");
		ObjectInputStream in = new ObjectInputStream(fin);
		Student s2 = (Student) in.readObject();

		fin = new FileInputStream("serializedObj1.dat");
		ObjectInputStream in1 = new ObjectInputStream(fin);
		Student s4 = (Student) in1.readObject();
		System.out.print("After Deserialization \t: ");
		System.out.println(s4);

		System.out.print("After Deserialization \t: ");
		System.out.println(s2);
		System.out.println("Are Equals : " + s1.equals(s2));
		System.out.println("Are Equals : " + s3.equals(s4));

	}
}
