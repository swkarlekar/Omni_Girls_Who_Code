import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import android.util.Log;

/**
 * Created by loaner on 7/1/15.
 */
public class SubRoutine {
    public boolean condition;
    private final int NYTIMES = 0;
    private final int MUSIC = 1;
    private final int TRAFFIC = 2;
    private final int MESSAGES = 3;
    public ArrayList<Integer> tasks = new ArrayList<Integer>();

    public SubRoutine(boolean cond, ArrayList<Integer> t)
    {
        if(cond)
        {
            completeTasks(tasks);
        }
        condition = cond;
        tasks = t;
    }
    public void completeTasks(ArrayList<Integer> tasks)
    {
        for(int i = 0; i < tasks.size(); i++)
        {
            doTask(tasks.get(i).intValue());
        }
    }
    public void changeCondition(boolean bool)
    {
        condition = bool;
    }
    public void checkForCondition()
    {
        if(condition)
        {
            completeTasks(tasks);
        }
    }
    public void doTask (int task)
    {
        switch(task)
        {
            case NYTIMES: nytimesTask();
                break;
            case MUSIC: musicTask();
                break;
            case TRAFFIC: trafficTask();
                break;
            case MESSAGES: messagesTask();
                break;
        }
    }
    public void nytimesTask()
    {
        Log.i("nytimes", "you got this");
    }
    public void musicTask()
    {
        Log.i("music", "you got this");
    }
    public void trafficTask()
    {
        Log.i("traffic", "you got this");
    }
    public void messagesTask()
    {
        Log.i("messages", "you got this");
    }

}
