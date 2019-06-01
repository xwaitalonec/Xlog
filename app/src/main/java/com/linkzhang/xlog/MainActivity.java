package com.linkzhang.xlog;

import android.os.Bundle;

import com.linkzhang.xloglibrary.L;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        L.config(this)
                .setConsoleSwitch(BuildConfig.DEBUG)
                .setLog2FileSwitch(true)
                .setFileFilter(L.D)
                .setsFilePrefix("ChaCha")
                .setIsSecondWrap(false);
        L.d(L.getConfig());
        L.json("{\"code\": 0, \"msg\": \"success\", \"data\": {\"aid\": \"5c4d4ed1ddf27b0039a3093f\", \"gold\": 200, \"name\": \"test\", \"head\": \"http://download.dual-whatsapp.com/head/nature-3348849.png\", \"rid\": 1663275, \"gender\": 2, \"country\": \"China\", \"city\": \"\", \"desc\": \"\", \"age\": 20, \"birthday\": \"\", \"banner\": [], \"is_manager\": 0, \"is_block\": 0, \"in_block\": 0, \"accept_talk\": 1, \"accept_voice\": 0, \"isPremium\": false, \"followed\": 0, \"follower\": 59, \"newFans\": 0, \"status\": 0, \"isFollowed\": 0, \"heat\": 42, \"gifts\": [{\"number\": 26, \"gicon\": \"http://download.dual-whatsapp.com/gift/balloon_love.png\"}, {\"number\": 82, \"gicon\": \"http://download.dual-whatsapp.com/gift/meiyuan.png\"}, {\"number\": 80, \"gicon\": \"http://download.dual-whatsapp.com/gift/diamond.png\"}, {\"number\": 72, \"gicon\": \"http://download.dual-whatsapp.com/gift/rose.png\"}, {\"number\": 73, \"gicon\": \"http://download.dual-whatsapp.com/gift/lsls.png\"}, {\"number\": 55, \"gicon\": \"http://download.dual-whatsapp.com/gift/fireworks.png/fireworks.png\"}, {\"number\": 21, \"gicon\": \"http://download.dual-whatsapp.com/gift/shuijingxie.png\"}, {\"number\": 14, \"gicon\": \"http://download.dual-whatsapp.com/gift/flower.png\"}, {\"number\": 86, \"gicon\": \"http://download.dual-whatsapp.com/gift/fireworks.pngfireworks.webphcp.png/hcp.png\"}, {\"number\": 47, \"gicon\": \"http://download.dual-whatsapp.com/gift/ngc.png\"}, {\"number\": 70, \"gicon\": \"http://download.dual-whatsapp.com/gift/love.png\"}, {\"number\": 63, \"gicon\": \"http://download.dual-whatsapp.com/gift/loveme.png\"}, {\"number\": 33, \"gicon\": \"http://download.dual-whatsapp.com/gift/qbt.png\"}, {\"number\": 89, \"gicon\": \"http://download.dual-whatsapp.com/gift/fireworks.pngfireworks.webphcp.pnghcp.webphuayuan.png/huayuan.png\"}, {\"number\": 43, \"gicon\": \"http://download.dual-whatsapp.com/gift/qixing.png\"}, {\"number\": 41, \"gicon\": \"http://download.dual-whatsapp.com/gift/bullion.png\"}, {\"number\": 60, \"gicon\": \"http://download.dual-whatsapp.com/gift/kiss.png\"}, {\"number\": 64, \"gicon\": \"http://download.dual-whatsapp.com/gift/merrygoround.png\"}, {\"number\": 34, \"gicon\": \"http://download.dual-whatsapp.com/gift/fireworks.png\"}, {\"number\": 49, \"gicon\": \"http://download.dual-whatsapp.com/gift/ring.png\"}], \"is_top\": false, \"is_new\": false}}");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        L.flush();
    }
}
