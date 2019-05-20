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

package com.alibaba.fescar.core.rpc;

import java.util.concurrent.TimeoutException;

/**
 * 客户端消息发送器
 * The interface Client message sender.
 *
 * @Author: jimin.jm @alibaba-inc.com
 * @Project: fescar -all
 * @DateTime: 2018 /10/10 12:21
 * @FileName: ClientMessageSender
 * @Description:
 */
public interface ClientMessageSender {
    /**
     * Send msg with response object.
     *
     * @param msg     the msg
     * @param timeout the timeout
     * @return the object
     * @throws TimeoutException the timeout exception
     */
    Object sendMsgWithResponse(Object msg, long timeout) throws TimeoutException;

    /**
     * Send msg with response object.
     *
     * @param serverAddress the server address
     * @param msg           the msg
     * @param timeout       the timeout
     * @return the object
     * @throws TimeoutException the timeout exception
     */
    Object sendMsgWithResponse(String serverAddress, Object msg, long timeout) throws TimeoutException;

    /**
     * Send msg with response object.
     *
     * @param msg the msg
     * @return the object
     * @throws TimeoutException the timeout exception
     */
    Object sendMsgWithResponse(Object msg) throws TimeoutException;

    /**
     * Send response.
     *
     * @param msgId         the msg id
     * @param serverAddress the server address
     * @param msg           the msg
     */
    void sendResponse(long msgId, String serverAddress, Object msg);
}
