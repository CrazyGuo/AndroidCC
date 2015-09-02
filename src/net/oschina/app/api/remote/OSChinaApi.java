package net.oschina.app.api.remote;

import android.text.TextUtils;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import net.oschina.app.AppContext;
import net.oschina.app.AppException;
import net.oschina.app.api.ApiHttpClient;
/*
import net.oschina.app.bean.EventApplyData;
import net.oschina.app.bean.NewsList;
import net.oschina.app.bean.Report;
import net.oschina.app.bean.Tweet;
import net.oschina.app.team.bean.Team;
*/
import net.oschina.app.util.StringUtils;
import net.oschina.app.util.TLog;

import org.kymjs.kjframe.utils.KJLoger;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URLEncoder;

public class OSChinaApi {
	/**
     * BUG上报
     * 
     * @param data
     * @param handler
     */
    public static void uploadLog(String data, AsyncHttpResponseHandler handler) {
        uploadLog(data, "1", handler);
    }
    
    private static void uploadLog(String data, String report,
            AsyncHttpResponseHandler handler) {
        RequestParams params = new RequestParams();
        params.put("app", "1");
        params.put("report", report);
        params.put("msg", data);
        ApiHttpClient.post("action/api/user_report_to_admin", params, handler);
    }
}
