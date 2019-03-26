package com.travala.testbuild;

public class TestDTO {
    private String name;
    private boolean success;

    public TestDTO() {
    }

    public TestDTO(String name, boolean success) {
        this.name = name;
        this.success = success;
    }

    public String getName() {
        return name;
    }

    public TestDTO setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public TestDTO setSuccess(boolean success) {
        this.success = success;
        return this;
    }
}
