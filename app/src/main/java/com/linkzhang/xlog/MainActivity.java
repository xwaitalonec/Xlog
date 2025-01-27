package com.linkzhang.xlog;

import android.os.Bundle;

import com.linkzhang.xloglibrary.L;
import com.tencent.mars.xlog.Log;

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
                .setIsSecondWrap(false)
                .setMaxFileSize(2*1024)
                .build();

        L.d(Log.getSysInfo());

        L.json("{\"code\": 0, \"msg\": \"success\", \"data\": {\"list\": [{\"unread\": 0, \"last_msg\": {\"msg_index\": \"5cb68b512f4333006de83596#official\", \"fromUid\": \"official\", \"toUid\": \"5cb68b512f4333006de83596\", \"msg_body\": \"Unfortunately, you dropped out of our anchor list\", \"msg_type\": 7, \"timestamp\": 1559308679, \"msg_info\": {}}, \"is_top\": 0, \"aid\": \"official\", \"is_official\": 1, \"name\": \"System message\", \"head\": \"http://download.dual-whatsapp.com/icon/ic_system_msg.png\", \"anonymous_img\": \"\", \"gender\": 1, \"country\": \"\", \"is_friend\": 0, \"is_open_info\": 1}, {\"unread\": 0, \"last_msg\": {\"msg_index\": \"5cb68b512f4333006de83596#5cde64fa2f43330073890d42\", \"fromUid\": \"5cb68b512f4333006de83596\", \"toUid\": \"5cde64fa2f43330073890d42\", \"msg_body\": \"\", \"msg_type\": 3, \"timestamp\": 1559309146, \"msg_info\": {}}, \"is_top\": 0, \"aid\": \"5cde64fa2f43330073890d42\", \"is_official\": 0, \"name\": \"Link Zhang\", \"head\": \"https://download.dual-whatsapp.com/chat/pic/551450758713703/20190517/profilePic.jpg\", \"anonymous_img\": \"https://download.dual-whatsapp.com/icon/anonymous_8.png\", \"gender\": 1, \"country\": \"hk_Hong Kong\", \"is_friend\": 1, \"is_open_info\": 1}, {\"unread\": 0, \"last_msg\": {\"msg_index\": \"5cb68b512f4333006de83596#5cbd364c2f43330063b75775\", \"fromUid\": \"5cbd364c2f43330063b75775\", \"toUid\": \"5cb68b512f4333006de83596\", \"msg_body\": \"https://download.dual-whatsapp.com/chat/pic/5cbd364c2f43330063b75775/20190523/36d4e2c8892081b0bde15fb2e0f0c61f.jpg\", \"msg_type\": 2, \"timestamp\": 1558577735, \"msg_info\": {}}, \"is_top\": 0, \"aid\": \"5cbd364c2f43330063b75775\", \"is_official\": 0, \"name\": \"HOU \", \"head\": \"https://download.dual-whatsapp.com/5cbd364c2f43330063b75775/20190518/head_1558175457695.jpg\", \"anonymous_img\": \"https://download.dual-whatsapp.com/icon/anonymous_14.png\", \"gender\": 1, \"country\": \"cn_China\", \"is_friend\": 1, \"is_open_info\": 1}, {\"unread\": 0, \"last_msg\": {\"msg_index\": \"5cb57be12f43330084c31f49#5cb68b512f4333006de83596\", \"fromUid\": \"5cb57be12f43330084c31f49\", \"toUid\": \"5cb68b512f4333006de83596\", \"msg_body\": \"\", \"msg_type\": 3, \"timestamp\": 1558417635, \"msg_info\": {}}, \"is_top\": 0, \"aid\": \"5cb57be12f43330084c31f49\", \"is_official\": 0, \"name\": \"redmi\", \"head\": \"https://download.dual-whatsapp.com/5cb57be12f43330084c31f49/20190523/head_1558581063823.jpg\", \"anonymous_img\": \"https://download.dual-whatsapp.com/icon/anonymous_14.png\", \"gender\": 1, \"country\": \"us_United States\", \"is_friend\": 1, \"is_open_info\": 1}, {\"unread\": 0, \"last_msg\": {\"msg_index\": \"5cb68b512f4333006de83596#5cc192c32f433300820ddf5e\", \"fromUid\": \"5cc192c32f433300820ddf5e\", \"toUid\": \"5cb68b512f4333006de83596\", \"msg_body\": \"You received a gift from A10\", \"msg_type\": 5, \"timestamp\": 1558182024, \"msg_info\": {\"cstatus\": 5, \"duration\": 0, \"from_uid\": \"5cc192c32f433300820ddf5e\", \"to_uid\": \"5cb68b512f4333006de83596\", \"gid\": 24, \"gicon\": \"http://download.dual-whatsapp.com/gift/kiss.png\", \"gname\": \"kiss\", \"number\": 1}}, \"is_top\": 0, \"aid\": \"5cc192c32f433300820ddf5e\", \"is_official\": 0, \"name\": \"A10\", \"head\": \"https://download.dual-whatsapp.com/5cc192c32f433300820ddf5e/20190513/head_1557716147595.jpg\", \"anonymous_img\": \"https://download.dual-whatsapp.com/icon/anonymous_12.png\", \"gender\": 1, \"country\": \"cn_China\", \"is_friend\": 0, \"is_open_info\": 1}, {\"unread\": 0, \"last_msg\": {\"msg_index\": \"5cb68b512f4333006de83596#5cbd63802f4333008ae49ecf\", \"fromUid\": \"5cbd63802f4333008ae49ecf\", \"toUid\": \"5cb68b512f4333006de83596\", \"msg_body\": \"You received a gift from n5\", \"msg_type\": 5, \"timestamp\": 1558180281, \"msg_info\": {\"cstatus\": 5, \"duration\": 0, \"from_uid\": \"5cbd63802f4333008ae49ecf\", \"to_uid\": \"5cb68b512f4333006de83596\", \"gid\": 24, \"gicon\": \"http://download.dual-whatsapp.com/gift/kiss.png\", \"gname\": \"kiss\", \"number\": 1}}, \"is_top\": 0, \"aid\": \"5cbd63802f4333008ae49ecf\", \"is_official\": 0, \"name\": \"Anonymous\", \"head\": \"https://download.dual-whatsapp.com/icon/anonymous_14.png\", \"anonymous_img\": \"https://download.dual-whatsapp.com/icon/anonymous_14.png\", \"gender\": 2, \"country\": \"us_United States\", \"is_friend\": 0, \"is_open_info\": 0}, {\"unread\": 0, \"last_msg\": {\"msg_index\": \"5cb68b512f4333006de83596#5cdcfbb72f4333007554c061\", \"fromUid\": \"5cdcfbb72f4333007554c061\", \"toUid\": \"5cb68b512f4333006de83596\", \"msg_body\": \"哦哦哦\", \"msg_type\": 1, \"timestamp\": 1558179451, \"msg_info\": {}}, \"is_top\": 0, \"aid\": \"5cdcfbb72f4333007554c061\", \"is_official\": 0, \"name\": \"sunshine lanbo\", \"head\": \"https://lh4.googleusercontent.com/-5NNrQBUuTMw/AAAAAAAAAAI/AAAAAAAAAAA/ACHi3rdaRSohnuN7fqFhQgkgDwvJdwdnIQ/s96-c/photo.jpg\", \"anonymous_img\": \"https://download.dual-whatsapp.com/icon/anonymous_6.png\", \"gender\": 1, \"country\": \"cn_China\", \"is_friend\": 1, \"is_open_info\": 1}, {\"unread\": 0, \"last_msg\": {\"msg_index\": \"5cb68b512f4333006de83596#5cbd61202f43330097114bb2\", \"fromUid\": \"5cbd61202f43330097114bb2\", \"toUid\": \"5cb68b512f4333006de83596\", \"msg_body\": \"https://download.dual-whatsapp.com/chat/pic/5cbd61202f43330097114bb2/20190518/7f96d184b898d6c9e2019a0933e9c21d.jpg\", \"msg_type\": 2, \"timestamp\": 1558177345, \"msg_info\": {}}, \"is_top\": 0, \"aid\": \"5cbd61202f43330097114bb2\", \"is_official\": 0, \"name\": \"Chris n5kkk\", \"head\": \"https://download.dual-whatsapp.com/head_default/icon_man_default_02.png\", \"anonymous_img\": \"https://download.dual-whatsapp.com/icon/anonymous_3.png\", \"gender\": 1, \"country\": \"cn_China\", \"is_friend\": 0, \"is_open_info\": 1}], \"next_page\": false, \"official\": 0, \"unread\": 0}}");
        for (String s: L.getUploadLogFiles()){
            L.d(s);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        L.flush();
    }
}
