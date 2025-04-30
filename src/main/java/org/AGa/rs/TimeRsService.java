package org.AGa.rs;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.Date;

@Path("time")
public class TimeRsService {

    @GET
    public Result geTime() {
        return new Result();
    }
}

class Result {
    public Date time = new Date();
    public String status = "OK";
}
