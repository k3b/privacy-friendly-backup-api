package org.secuso.privacyfriendlybackup.api.pfa

import androidx.annotation.IntDef

object PfaApi {

    const val CONNECT_ACTION = "org.secuso.privacyfriendlybackup.api.PFAAuthService"

    @IntDef(MSG_AUTHENTICATE, MSG_BACKUP, MSG_RESTORE)
    @Retention(AnnotationRetention.SOURCE)
    annotation class MessageCodes

    const val MSG_AUTHENTICATE = 1
    const val MSG_BACKUP = 2
    const val MSG_RESTORE = 3


    @IntDef(REPLY_AUTHENTICATION_OK, REPLY_AUTHENTICATION_ERROR, REPLY_NOT_AUTHENTICATED)
    @Retention(AnnotationRetention.SOURCE)
    annotation class MessageReplyCodes

    const val REPLY_AUTHENTICATION_OK = 127
    /**
     * If this error is sent, the arg1 in the Message will dictate the specific error code
     */
    const val REPLY_AUTHENTICATION_ERROR = 128
    const val REPLY_NOT_AUTHENTICATED = 129


    @IntDef(ERROR_AUTH_CERT_MISMATCH, ERROR_AUTH_APPLICATION_NOT_FOUND)
    @Retention(AnnotationRetention.SOURCE)
    annotation class MessageReplyErrorCodes

    const val ERROR_AUTH_CERT_MISMATCH = 1
    const val ERROR_AUTH_APPLICATION_NOT_FOUND = 2
}