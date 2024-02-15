FROM node:14-alpine

WORKDIR /usr/src/app

RUN npm install

COPY . .
# COPY --from=build /app .
# RUN npm run build

FROM nginx:latest
COPY nginx.conf /etc/nginx/nginx.conf
EXPOSE 8000
