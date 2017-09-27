package se.mah.af6589.lab8c;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends Activity {
    private Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        MainFragment mainFragment = (MainFragment)fm.findFragmentById(R.id.fragment);
        controller = new Controller(this,mainFragment);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public Controller getController() {
        return controller;
    }

    public ReceiveListener getListener() {
        return controller.getListener();
    }
}
