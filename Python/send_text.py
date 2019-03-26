from twilio.rest import Client

# Your Account SID from twilio.com/console
account_sid = "ACf9b82f66623735141f108c93b30515ed"
# Your Auth Token from twilio.com/console
auth_token  = "3946f53b4aaafc76b5fb5dc89dc57e7a"

client = Client(account_sid, auth_token)

message = client.messages.create(
    to="+919560606814", 
    from_="+13023216450 ",
    body="Hello from Python!")

print(message.sid)
