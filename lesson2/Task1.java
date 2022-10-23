// Дана строка sql-запроса "select * from students".
    // Сформируйте часть WHERE этого запроса, используя StringBuilder.
    //
    // 1) Данные для фильтрации подаются в метод двумя массивами paramName и paramValue.
    // 2) Данные для фильтрации подаются в метод строкой в формате json.

import org.json.JSONObject;
import org.json.JSONTokener;
import java.util.Iterator;

public class Task1 
{
    static String createRequestString(String[] paramName, String[] paramValue)
    {
        
        //Возвращаем пустую строку для массивов нулевой длины
        if (paramName.length==0 || paramValue.length==0)
        {
            return "";
        }
        StringBuilder requestString = new StringBuilder();
        // Если длина массивов одинаковая собираем строку
        if (paramName.length == paramValue.length)
        {
            //Проверка для массива длины 1
            if (paramName.length == 1)
            {
                requestString.append(String.format("WHERE %s=\'%s\'", paramName[0] , paramValue[0]));
                return requestString.toString();
            }
            requestString.append("WHERE ");
            //Делаем конкатенацию строк через цикл 
            for (int i=0; i<paramValue.length;i++)
            {
                requestString.append(String.format("%s=\'%s\'", paramName[i], paramValue[i]));
                if (i != paramName.length-1)
                {
                    requestString.append(" AND ");
                }
            }
            return requestString.toString();
        }
        return "";
    }
    //метод для перевода json в строку SQL
    static String jsonToSql(String jsonString)
    {   
        StringBuilder requestString = new StringBuilder("WHERE ");
        //Создаём json объект.
        JSONObject jo = new JSONObject(jsonString);
        Iterator<String> key = jo.keys();
        while (key.hasNext())
        {   
            String str = key.next();
            if (key.hasNext() != true)
            {
                requestString.append(String.format("%s=\"%s\"",str, jo.get(str)));
            }
            else
            {
                requestString.append(String.format("%s=\"%s\" AND ",str, jo.get(str)));   
            }
        }
        return requestString.toString();
           
    }
    public static void main(String[] args) 
    {
        String sqlRequest = "select * from students";
        String[] paramName = {"hero_name", "damage"};
        String[] paramValue = {"kakashi", "1342"};
        String response = createRequestString(paramName, paramValue);
        System.out.println(sqlRequest + response);
        String jsonString = "{\"name\": \"kakashi\", \"damage\":\"100\"}";
        String result2 = sqlRequest + jsonToSql(jsonString);
        System.out.println(result2);


    }
}