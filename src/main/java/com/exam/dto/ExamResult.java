package com.exam.dto;

/**
 * Created by Tman on 2017/4/2.
 */
public class ExamResult<T> {
    private boolean success;
    private T data;
    private String error;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public ExamResult() {
    }

    public ExamResult(boolean success, T data, String error) {
        this.success = success;
        this.data = data;
        this.error = error;
    }

    public ExamResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public ExamResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }


    @Override
    public String toString() {
        return "ExamResult{" +
                "success=" + success +
                ", data=" + data +
                ", error='" + error + '\'' +
                '}';
    }
}
