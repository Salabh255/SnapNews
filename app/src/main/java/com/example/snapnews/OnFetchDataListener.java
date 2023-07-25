package com.example.snapnews;

import com.example.snapnews.Models.NewsApiResponse;
import com.example.snapnews.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener {
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}

