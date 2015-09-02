package net.oschina.app.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ZoomButtonsController;

//import com.dtr.zxing.activity.CaptureActivity;

import net.oschina.app.AppConfig;
import net.oschina.app.AppContext;
/*
import net.oschina.app.base.BaseListFragment;
import net.oschina.app.bean.Active;
import net.oschina.app.bean.Comment;
import net.oschina.app.bean.Constants;
import net.oschina.app.bean.News;
import net.oschina.app.bean.Notice;
import net.oschina.app.bean.ShakeObject;
import net.oschina.app.bean.SimpleBackPage;
import net.oschina.app.bean.Tweet;
import net.oschina.app.fragment.BrowserFragment;
import net.oschina.app.fragment.CommentFrament;
import net.oschina.app.fragment.FriendsFragment;
import net.oschina.app.fragment.MessageDetailFragment;
import net.oschina.app.fragment.QuestionTagFragment;
import net.oschina.app.fragment.SoftWareTweetsFrament;
import net.oschina.app.interf.ICallbackResult;
import net.oschina.app.interf.OnWebViewImageListener;
import net.oschina.app.service.DownloadService;
import net.oschina.app.service.DownloadService.DownloadBinder;
import net.oschina.app.service.NoticeService;
import net.oschina.app.team.adapter.TeamMemberAdapter;
import net.oschina.app.team.bean.Team;
import net.oschina.app.team.bean.TeamActive;
import net.oschina.app.team.bean.TeamDiscuss;
import net.oschina.app.team.bean.TeamIssue;
import net.oschina.app.team.bean.TeamIssueCatalog;
import net.oschina.app.team.bean.TeamMember;
import net.oschina.app.team.bean.TeamProject;
import net.oschina.app.team.fragment.TeamActiveFragment;
import net.oschina.app.team.ui.TeamMainActivity;
import net.oschina.app.team.ui.TeamNewIssueActivity;
import net.oschina.app.ui.DetailActivity;
import net.oschina.app.ui.EventLocationActivity;
import net.oschina.app.ui.ImagePreviewActivity;
import net.oschina.app.ui.LoginActivity;
import net.oschina.app.ui.SimpleBackActivity;
import net.oschina.app.ui.TweetActivity;
import net.oschina.app.viewpagerfragment.FriendsViewPagerFragment;
import net.oschina.app.widget.AvatarView;
*/
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URLDecoder;

/**
 * 界面帮助类
 * 
 * @author FireAnt（http://my.oschina.net/LittleDY）
 * @version 创建时间：2014年10月10日 下午3:33:36
 * 
 */
public class UIHelper {
	 /**
     * 发送通知广播
     * 
     * @param context
     */
    public static void sendBroadcastForNotice(Context context) {
       // Intent intent = new Intent(NoticeService.INTENT_ACTION_BROADCAST);
       // context.sendBroadcast(intent);
    }
    
    /**
     * 发送App异常崩溃报告
     * 
     * @param context
     * @param crashReport
     */
    public static void sendAppCrashReport(final Context context) {

        /*DialogHelp.getConfirmDialog(context, "程序发生异常", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // 退出
                System.exit(-1);
            }
        }).show();*/
    }


}
