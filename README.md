Host: sftp://localhost  
Login: foo   
Senha: pass  
Port: 2222

obs.: é preciso da permissão a pasta /upload 

```shell
sudo chmod 777 -R upload
```

```shell
docker run \
    --name sftp \
    -v /home/<user>/upload:/home/foo/upload \
    -p 2222:22 -d atmoz/sftp \
    foo:pass:1001
```

```yaml
version: '3.9'
services:
  sqs:
    image: roribio16/alpine-sqs:latest
    ports:
      - "9324:9324"
      - "9325:9325"
```

```shell
aws --endpoint-url http://localhost:9324 sqs create-queue --queue-name pocsftp
aws --endpoint-url=http://localhost:9324 sqs send-message --queue-url http://localhost:9324/queue/pocsftp --message-body "Mensagem de teste"
```