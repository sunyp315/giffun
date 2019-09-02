package com.base.phone.ky.common.base

import android.support.annotation.CallSuper
import android.support.v7.app.AppCompatActivity
import com.base.phone.ky.common.callback.RequestLifecycle

/**
 * @author: sunyp
 * @date: 2019/9/2
 */
open class BaseActivity : AppCompatActivity(), RequestLifecycle {

    /**
     * @CallSuper：
     * 表示该方法被重写的时候，子方法必须调用父类的方法，不然就报错
     */
    @CallSuper
    override fun startLoading() {

    }

    @CallSuper
    override fun loadFinished() {

    }

    @CallSuper
    override fun loadFailed(msg: String?) {

    }

}