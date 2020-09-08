package com.withertech.overtokapi.resource;

import com.withertech.overtokapi.model.OvertokModel;
import com.withertech.overtokapi.object.follower;
import org.python.util.PythonInterpreter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/followers")
public class OvertokResource
{
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response followers()
    {
        OvertokModel response = new OvertokModel(0, new follower[]{
                new follower(false, "6850475539113100289", "FR", "https://p16.tiktokcdn.com/aweme/1080x1080/tiktok-obj/14f897f6c703844dac6d5cf1b1bcb247.webp", "https://p16.tiktokcdn.com/aweme/720x720/tiktok-obj/14f897f6c703844dac6d5cf1b1bcb247.webp", "chendang9773", "MS4wLjABAAAA4ttO4emGy7HVr1FZj3Eu1S-4UyLIz_CvVq1dnqmQjE5xi3fwf5ojG40zM2LXvO3k", "user4658493671468", false)
        });
/*        try(PythonInterpreter pyInterp = new PythonInterpreter()) {
            pyInterp.exec("print('Hello Python World!')");
        }*/
        return Response.ok(response).build();
    }
}
