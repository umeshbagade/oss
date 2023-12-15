FROM fedora

# Install necessary tools
RUN dnf install -y rpm-build rpmdevtools

# Copy the calculator directory to the container
COPY calculator /calculator

# Set working directory
WORKDIR /calculator

# Build the RPM package
RUN rpmbuild -bb SPECS/calculator.spec
