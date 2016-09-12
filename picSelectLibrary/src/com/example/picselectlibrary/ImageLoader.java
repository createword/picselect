package com.example.picselectlibrary;


import android.content.Context;
import android.widget.ImageView;

import java.io.Serializable;

/**
 * ImageLoader
 * 
 */
public interface ImageLoader extends Serializable {
	void displayImage(Context context, String path, ImageView imageView);
}