import org.springframework.cloud.contract.spec.Contract
Contract.make {
    description "should return even when number input is even"
    request{
        method GET()
        url("/api/service/getHealth") {
        }
    }
    response {
        body("responseCode:200,responseDesription:SUCCESS,response:UP")
        status 200
    }
}