FROM node:20-alpine AS build

LABEL maintainer="touremjean@hotmail.com"
# Running applications with user privileges helps to mitigate some risks
RUN addgroup -S dockergroup && adduser -S dockeruser -G dockergroup
USER dockeruser:dockergroup

WORKDIR /app

COPY --chown=dockeruser:dockergroup package*.json ./

RUN npm cache clean --force
RUN npm install

COPY --chown=dockeruser:dockergroup . .

RUN npm run build

# Serve Application using Nginx Server

FROM nginx:alpine

COPY --from=build /app/dist/homes-app/ /app
COPY nginx.conf /etc/nginx/nginx.conf

EXPOSE 80