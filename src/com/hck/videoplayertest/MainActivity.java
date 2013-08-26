package com.hck.videoplayertest;

import java.util.ArrayList;

import com.hck.video.bean.VideoBean;
import com.hck.video.player.ui.PlayVideoActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	private ArrayList<VideoBean> beans;
	private VideoBean bean;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		beans=new ArrayList<VideoBean>();
	}
	public void play1(View view)
	{
		initDate1();
		Intent intent=new Intent();
		intent.setClass(this, PlayVideoActivity.class);
		intent.putExtra("videos", beans.toArray());
		intent.putExtra("id", 0);
		startActivity(intent);
	}
	public void play2(View view)
	{
		
	}
	private void initDate1()
	{
		bean=new VideoBean();
		bean.setId(1);
		bean.setVideoName("行行出2貨");
		bean.setVideoPlayUrl("/mnt/sdcard/三百六十行 行行出二货.mp4");
		beans.add(bean);
		
		bean=new VideoBean();
		bean.setId(2);
		bean.setVideoName("美女组合");
		bean.setVideoPlayUrl("/mnt/sdcard/七朵组合玉生烟.mp4");
		beans.add(bean);
		
	}
	private void initDate2()
	{
		
	}
}
