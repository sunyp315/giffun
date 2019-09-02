package com.base.phone.ky.common.callback

/**
 * 在Activity或Fragment中进行网络请求所需要经历的生命周期函数。
 * @author: sunyp
 * @date: 2019/9/2
 */
interface RequestLifecycle {
    /**
     * 开始加载
     */
    fun startLoading()

    /**
     * 加载完成
     */
    fun loadFinished()

    /**
     * 加载失败
     */
    fun loadFailed(msg: String?)
}