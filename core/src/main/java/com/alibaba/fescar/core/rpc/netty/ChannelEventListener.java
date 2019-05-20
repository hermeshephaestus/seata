/*
 *  Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.alibaba.fescar.core.rpc.netty;

import io.netty.channel.Channel;

/**
 * netty channel事件监听器
 * The interface Channel event listener.
 *
 * @Author: jimin.jm @alibaba-inc.com
 * @Project: fescar -all
 * @DateTime: 2018 /9/12 14:01
 * @FileName: ChannelEventListener
 * @Description:
 */
public interface ChannelEventListener {
    /**
     * On channel connect.
     *
     * @param remoteAddr the remote addr
     * @param channel    the channel
     */
    void onChannelConnect(final String remoteAddr, final Channel channel);

    /**
     * On channel close.
     *
     * @param remoteAddr the remote addr
     * @param channel    the channel
     */
    void onChannelClose(final String remoteAddr, final Channel channel);

    /**
     * On channel exception.
     *
     * @param remoteAddr the remote addr
     * @param channel    the channel
     */
    void onChannelException(final String remoteAddr, final Channel channel);

    /**
     * On channel idle.
     *
     * @param remoteAddr the remote addr
     * @param channel    the channel
     */
    void onChannelIdle(final String remoteAddr, final Channel channel);
}
