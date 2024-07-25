import java.io.fileinputstream;
import java.io.fileoutputstram;
import java.io.IoException;
public class copy
{
public static void main(string arg[])throws IoException
{
fileinputstream in=null;
fileoutputstream out=null;
try
{
in=new fileinputstream("a.txt");
out=new fileoutputstream("su.txt");
int c;
while((c=in.read()!=-1)
{
out.write(c);
}
}
finally
{
if(in!=null)
{
in.close();
}
if(out!=null)
{
out.close();
}
}
}
}