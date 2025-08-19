# Personal Portfolio Website

A modern, responsive personal portfolio website built with HTML, CSS, and JavaScript. Features a beautiful design with dark/light theme toggle, smooth animations, and mobile-friendly layout.

## ✨ Features

- **Responsive Design**: Looks great on all devices (desktop, tablet, mobile)
- **Dark/Light Theme**: Toggle between themes with smooth transitions
- **Smooth Animations**: Scroll-triggered animations and hover effects
- **Interactive Navigation**: Smooth scrolling with active section highlighting
- **Contact Form**: Functional contact form with validation
- **Modern UI**: Clean, professional design with gradient accents
- **Performance Optimized**: Throttled scroll events and lazy loading

## 🚀 Quick Start

1. **Clone or download** the files to your local machine
2. **Open `index.html`** in your web browser
3. **Customize the content** with your personal information
4. **Deploy** to your preferred hosting platform

## 📁 File Structure

```
portfolio/
├── index.html          # Main HTML structure
├── styles.css          # CSS styles and animations
├── script.js          # JavaScript functionality
└── README.md          # Documentation
```

## 🎨 Customization

### Personal Information

Replace the placeholder content in `index.html`:

1. **Hero Section**: Update name, title, and description
2. **About Section**: Add your personal story and statistics
3. **Projects Section**: Replace with your actual projects
4. **Skills Section**: Update with your technologies
5. **Contact Section**: Add your contact information

### Profile Picture

Replace the placeholder image URL in the hero section:
```html
<img src="your-photo-url.jpg" alt="Profile Picture">
```

### Colors and Styling

Modify the CSS variables in `styles.css`:
```css
:root {
    --primary-color: #4f46e5;    /* Main brand color */
    --secondary-color: #10b981;   /* Accent color */
    --accent-color: #f59e0b;      /* Highlight color */
}
```

### Projects

Update the project cards with your actual work:
```html
<div class="project-card">
    <div class="project-image">
        <img src="your-project-image.jpg" alt="Project Name">
        <!-- Update overlay links -->
        <div class="project-overlay">
            <div class="project-links">
                <a href="your-live-demo-url" class="project-link">
                    <i class="fas fa-external-link-alt"></i>
                </a>
                <a href="your-github-repo-url" class="project-link">
                    <i class="fab fa-github"></i>
                </a>
            </div>
        </div>
    </div>
    <div class="project-content">
        <h3>Your Project Name</h3>
        <p>Your project description...</p>
        <div class="project-tech">
            <span class="tech-tag">Technology 1</span>
            <span class="tech-tag">Technology 2</span>
        </div>
    </div>
</div>
```

### Social Links

Update social media links in the contact section:
```html
<div class="social-links">
    <a href="your-linkedin-url" class="social-link">
        <i class="fab fa-linkedin"></i>
    </a>
    <a href="your-github-url" class="social-link">
        <i class="fab fa-github"></i>
    </a>
    <!-- Add more social links as needed -->
</div>
```

## 🔧 Features Explained

### Theme Toggle
- Automatic theme persistence using localStorage
- Smooth transitions between light and dark modes
- Icon changes based on current theme

### Smooth Scrolling
- Navigation links smoothly scroll to sections
- Active section highlighting in navigation
- Mobile-friendly hamburger menu

### Form Handling
- Client-side form validation
- Success/error message display
- Responsive form design

### Animations
- Scroll-triggered fade-in animations
- Typing animation for hero title
- Counter animation for statistics
- Hover effects on interactive elements

## 📱 Mobile Responsiveness

The portfolio is fully responsive with:
- Mobile-first design approach
- Hamburger menu for mobile navigation
- Flexible grid layouts
- Optimized touch targets
- Readable typography on all screen sizes

## 🌐 Deployment

### GitHub Pages
1. Create a new repository on GitHub
2. Upload your files
3. Go to Settings > Pages
4. Select source branch (usually `main`)
5. Your site will be available at `https://username.github.io/repository-name`

### Netlify
1. Drag and drop your project folder to [Netlify](https://netlify.com)
2. Your site will be deployed instantly with a custom URL

### Vercel
1. Install Vercel CLI: `npm i -g vercel`
2. Run `vercel` in your project directory
3. Follow the deployment prompts

## 🛠️ Browser Support

- Chrome (latest)
- Firefox (latest)
- Safari (latest)
- Edge (latest)

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 🤝 Contributing

Feel free to fork this project and customize it for your own use. If you make improvements, consider sharing them back with the community!

## 📞 Support

If you need help customizing your portfolio, feel free to:
- Open an issue on GitHub
- Contact me through the portfolio contact form
- Check the code comments for guidance

---

**Happy coding!** 🚀