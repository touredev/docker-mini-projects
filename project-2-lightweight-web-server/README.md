# Project 2: Lightweight Web Server

* Requirement: Serve a website or API with minimal resource overhead and easy deployment.
* Summary: Package a lightweight web server like Nginx or Apache into a Docker container for rapid deployment on any supporting machine.
* Tools & Services:
    * Docker
    * Nginx or Apache
* High-Level Steps:
    1. Create Dockerfile: Start with a lean base image (e.g., Alpine Linux). Install Nginx or Apache, and copy your website files or API code into the designated locations.
    2. Build Image: Use docker build to create the web server image.
    3. Run Container: Start the container with docker run, exposing the necessary ports (e.g., 80 for HTTP or 443 for HTTPS).