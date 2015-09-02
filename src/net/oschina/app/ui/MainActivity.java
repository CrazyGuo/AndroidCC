package net.oschina.app.ui;

import android.view.KeyEvent;

import net.oschina.app.AppConfig;
import net.oschina.app.AppContext;
import net.oschina.app.AppManager;
import net.oschina.app.R;
import net.oschina.app.R.id;
import net.oschina.app.R.layout;
import net.oschina.app.R.menu;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	private DoubleClickExitHelper mDoubleClickExit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AppManager.getAppManager().addActivity(this);
		initView();
	}

	//@Override
    public void initView() {
        mDoubleClickExit = new DoubleClickExitHelper(this);
	}
	/**
     * 监听返回--是否退出程序
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            // 是否退出应用
            if (AppContext.get(AppConfig.KEY_DOUBLE_CLICK_EXIT, true)) {
                return mDoubleClickExit.onKeyDown(keyCode, event);
            }
        }
        return super.onKeyDown(keyCode, event);
    }

}
